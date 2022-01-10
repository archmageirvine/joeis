package irvine.math.group;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.partitions.NonnegativeIntegerComposition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.MultivariateMonomialOperation;
import irvine.math.polynomial.StandardMultiply;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.util.io.IOUtils;

/**
 * Cycle index for general linear group over <code>GF2</code> from precomputed data.
 * @author Sean A. Irvine
 */
public final class GeneralLinearCycleIndex {

  private GeneralLinearCycleIndex() { }

  /**
   * Return the cycle index of <code>GL_n(Z_2)</code>.
   * @param n index
   * @return cycle index
   */
  public static CycleIndex cycleIndex(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    try {
      try (final BufferedReader r = IOUtils.reader("irvine/math/group/gl/" + n + ".gz")) {
        final String s = r.readLine();
        if (s == null) {
          throw new UnsupportedOperationException();
        }
        final int space = s.indexOf(' ');
        final Z order = new Z(s.substring(0, space));
        final CycleIndex ci = new CycleIndex("GL_" + n + "(Z_2)");
        final String[] spec = s.substring(space + 1).split("]");
        for (final String t : spec) {
          final int leftBracket = t.indexOf('[');
          final Z m = new Z(t.substring(0, leftBracket));
          final String[] coeffs = t.substring(leftBracket + 1).split(",");
          final MultivariateMonomial mm = new MultivariateMonomial();
          mm.setCoefficient(new Q(m, order));
          for (int k = 0; k < coeffs.length; ++k) {
            mm.add(k + 1, Integer.parseInt(coeffs[k]));
          }
          ci.add(mm);
        }
        return ci;
      }
    } catch (final IOException | NullPointerException e) {
      throw new UnsupportedOperationException(e);
    }
  }

  /**
   * Print cycle index.
   *
   * @param args cycle index to print.
   */
  public static void main(final String[] args) {
    System.out.println(new GeneralLinearCycleIndex().zykelind_glkq(5, 2));
    //System.out.println(cycleIndex(Integer.parseInt(args[0])));
  }

  // todo a and b are return values here!
  private void exponenten_bestimmen(final int d, final int q, List<List<Z>> a, List<List<Z>> b) {
//    OP hilf,hilfv,dd,c,e,f,g,h,speicher;
//    OP ax_e;
//    INT erg=OK;
//    hilf=callocobject();
//    hilfv=callocobject();
//    dd=callocobject();
//    c=callocobject();
//    e=callocobject();
//    f=callocobject();
//    g=callocobject();
//    h=callocobject();
//    speicher=callocobject();
//    init(BINTREE,speicher);
    final TreeSet<Z> speicher = new TreeSet<>();
//    a = new Object[d];
//    b = new Object[d];
    for (int i = 0; i < d; ++i) {
      final long dd = i + 1;
      final List<Z> hilf = new ArrayList<>();
      final List<Z> hilfv = new ArrayList<>();
      long l = 0L;
      final Z c = Z.valueOf(q).pow(dd).subtract(1); //hoch(q, dd, c);
      //dec(c);
      final Z[] e = Cheetah.factor(c).divisors();
      for (int j = 0; j < e.length; ++j) {
        if (dd == 1 && Z.ONE.equals(e[j])) {
          hilf.add(Z.ONE);
          hilfv.add(e[j]);
//          inc(hilf);
//          inc(hilfv);
//          copy(e[j], hilfv[l]);
//          M_I_I(1L, hilf[l]);
          l = l + 1L; // tracking length of of list
          final Z ax_e = e[j];
          speicher.add(ax_e);
//          insert(ax_e, speicher, NULL, NULL);
        } else {
          //euler_phi(S_V_I(e, j), f);
          final Z f = Euler.phi(e[j]);
          final Z[] qr = f.divideAndRemainder(Z.valueOf(dd));
          final Z g = qr[0];
          final Z h = qr[1];
          //quores(f, dd, g, h);
          if (h.isZero()) {
//            ax_e = callocobject();
//            copy(S_V_I(e, j), ax_e);
            final Z ax_e = e[j];
            if (speicher.add(ax_e)) {
//            if (insert(ax_e, speicher, NULL, NULL) == INSERTOK) {
              hilfv.add(e[j]);
              hilf.add(g);
//              inc(hilf);
//              inc(hilfv);
//              copy(S_V_I(e, j), S_V_I(hilfv, l));
//              copy(g, S_V_I(hilf, l));
              ++l;
              /*printf("Exponent = %d , Vielfachheit = %d\n",s_v_ii(e,j),s_i_i(g));*/
            }
          }
        }
      }
      /* e=callocobject(); AK 260594 */
      a.add(hilfv);
      b.add(hilf);
//      copy(hilfv, S_V_I(a, i));
//      copy(hilf, S_V_I(b, i));
    }
//    freeall(e);
//    freeall(hilf);
//    freeall(hilfv);
//    freeall(dd);
//    freeall(c);
//    freeall(f);
//    freeall(g);
//    freeall(h);
//    freeall(speicher);
//    if (erg!=OK) error("in computation of exponenten_bestimmen(d,q,a,b)");
//    return(erg);
  }

  /* Berechnet anz nach einer Formel von J.P.Kung als die Anzahl der
  Matrizen in GL(cd,Fq) die mit einer Matrix, die aus lambda(1)
  Begleitmatrizen eines irreduziblen Polynoms p, lambda(2)
  Hyperbegleitmarizen von p^2 usw. besteht.
  Dabei ist d der Grad des Polynoms p, lambda eine Partition von c (das
  ist die hoechste Potenz von p, die das charakteristische Polynom einer
  Matrix teilt, von der D(p,lambda) ein Block ist), q die Maechtigkeit
  des Koerpers und anz das Ergebnis.  */
  Z kung_formel(final int d, final int[] lambda, final int q) { //OP d,lambda,q,anz;
//    INT i,j;
//    INT erg=OK;
//    OP hilf,hilf1,hilf2,mu;
//    if (S_O_K(d)!=INTEGER) return error("kung_formel(d,lambda,q,anz) d not INTEGER");
//    if (S_I_I(d)<1L) return error("kung_formel(d,lambda,q,anz)  d<1");
//    if (S_O_K(lambda)!=PARTITION) return error("kung_formel(d,lambda,q,anz) lambda not PARTITION");
//    if (S_O_K(q)!=INTEGER) return error("kung_formel(d,lambda,q,anz) q not INTEGER");
//    if (!emptyp(anz)) freeself(anz);
//    hilf=callocobject();
//    hilf1=callocobject();
//    hilf2=callocobject();
//    mu=callocobject();
//    if (S_PA_K(lambda)==VECTOR) t_VECTOR_EXPONENT(lambda,lambda);
//    M_I_I(0L, mu);
//    M_I_I(1L, anz);
    long mu = 0;
    Z anz = Z.ONE;
    // note entry 0 of lambda is not used!
    for (int i = 1; i < lambda.length; ++i) { // todo possibly should start at 1
      for (int j = i; j < lambda.length; ++j) {
        mu += lambda[j];
        //add_apply(lambda[j], mu);
      }
      //mult(d, mu, hilf);
      //hoch(q, hilf, hilf);
      Z hilf = Z.valueOf(q).pow(d * mu);
      for (int j = 1; j <= lambda[i]; ++j) {
        final Z hilf2 = Z.valueOf(q).pow((mu - j) * d);
//        m_i_i(j, hilf1);
//        sub(mu, hilf1, hilf2);
//        mult_apply(d, hilf2);
//        hoch(q, hilf2, hilf2);
        final Z hilf1 = hilf.subtract(hilf2);
//        sub(hilf, hilf2, hilf1);
//        mult_apply(hilf1, anz);
        anz = anz.multiply(hilf1);
      }
    }
//    freeall(hilf);
//    freeall(hilf1);
//    freeall(hilf2);
//    freeall(mu);
//    if (erg!=OK) error(" in computation of kung_formel(d,lambda,q,anz)");
//    return(erg);
    return anz;
  }

  /* Bestimmt den Zykeltyp der Hyperbegleitmatrix von p(x)^i, einem
  irreduziblen normierten Polynom vom Grad d mit Exponenten exp, ueber
  einem Koerper von Charakteristik p und Maechtigkeit q. Das Ergebnis ist
  ergeb*/
  CycleIndex zykeltyp_hyperbegleitmatrix_poly(final int d, final int exp, final int i, final int p, final int q) {
//    OP e,hilf,hilf1,hilf2,hilfpoly;
//    INT j,k;
//    INT erg=OK;
//    e=callocobject();
//    hilf=callocobject();
//    hilf1=callocobject();
//    hilf2=callocobject();
//    hilfpoly=callocobject();
    //m_il_v(i,e);
    final int[] e = new int[i];
    //copy(exp,S_V_I(e,0L));
    e[0] = exp;
    int k = 1;
    for (int j = 1; j < i; ++j) {
      //copy(S_V_I(e, j - 1L), S_V_I(e, j));
      e[j] = e[j - 1];
      if (k < j + 1L) {
        k = k * p; //s_i_i(p);
        e[j] *= p; // todo huh p is an array?
        //mult_apply(p, S_V_I(e, j));
      }
    }
    MultivariateMonomial mm = MultivariateMonomial.create(1, Z.ONE);
   // CycleIndex ergeb = z1("hb"); //CycleIndex.ONE.copy();
    //m_iindex_monom(0L, ergeb);
    Z hilf = Z.valueOf(q).pow(d);
    //hoch(q, d, hilf);
//    copy(hilf, hilf1);
//    dec(hilf1);
     Z hilf1 = hilf.subtract(1);
//    ganzdiv(hilf1, exp, hilf2);
     Z hilf2 = hilf1.divide(exp);
//    m_iindex_iexponent_monom(exp - 1, hilf2.intValueExact(), hilfpoly); /* HF130696 */
//    mult_apply(hilfpoly, ergeb);
    //MultivariateMonomial hilfpoly = MultivariateMonomial.create(exp -1, hilf2);
   // MultivariateMonomial hilfpoly = MultivariateMonomial.create(exp, hilf2);
    mm.add(exp, hilf2);
    for (int j = 1; j < i; ++j) {
      //mult_apply(hilf, hilf1);
      hilf1 = hilf1.multiply(hilf);
      //ganzdiv(hilf1, S_V_I(e, j), hilf2);
       hilf2 = hilf1.divide(e[j]);
//      m_iindex_iexponent_monom(e[j] - 1, hilf2.intValueExact(), hilfpoly); /* HF130696 */
//      mult_apply(hilfpoly, ergeb);
      //hilfpoly = MultivariateMonomial.create(e[j] -1, hilf2);
      //hilfpoly = MultivariateMonomial.create(e[j], hilf2);
      mm.add(e[j], hilf2);
    }
//    freeall(e);
//    freeall(hilf);
//    freeall(hilf1);
//    freeall(hilf2);
//    freeall(hilfpoly);
//    if (erg != OK) error("in computation of zykeltyp_hyperbegleitmatrix_poly(d,exp,i,p,q,ergeb) ");
    return new CycleIndex("hb", mm);
  }

  //private static final CycleIndex Z1 = new CycleIndex("Z1", MultivariateMonomial.create(1, 1));
  private static final CycleIndex EMPTY = CycleIndex.ZERO.copy();
  private static final MultivariateMonomialOperation OP = HararyMultiply.OP;

  private CycleIndex z1(final String name) {
    return new CycleIndex(name, MultivariateMonomial.create(1, 1));
  }

  /* Berechnet den Zykeltyp einer Blockdiagonalmatrix besthend aus
  Begleit und Hyperbegleitmatrizen eines irreduziblen normierten Polynoms
  vom Grad d, Exponenten (=Periode bzw. Ordnung) exp; Die Gestalt dieser
  Matrix wird durch die Prtition mu festgelegt, p ist die Charakteristik
  des Koerpers, q dessen Maechtigkeit, und ergeb ist der berechnete
  Zykeltyp.  */
  CycleIndex zykeltyp_poly_part(int d, int exp, int[] mu, int p,int q) {
    System.out.println("zykeltyp_poly_part(" + d + " " + exp + " " + Arrays.toString(mu) + " " + p + " " + q + ")"); // sai
    CycleIndex ergeb = CycleIndex.ONE.copy();
    ergeb.setName("");
//    INT i;
//    INT erg=OK;
//    OP hilf,hilf1;
//    hilf=callocobject();
//    hilf1=callocobject();
//    m_iindex_monom(0L,ergeb);
    for (int i = 1; i < mu.length; ++i) {
      if (mu[i] != 0) {
        final CycleIndex hilf = zykeltyp_hyperbegleitmatrix_poly(d, exp, i, p, q);
        System.out.println("hyperbegle: " + hilf);
        //zykelind_hoch_dir_prod(hilf, mu[i], hilf1);
        final CycleIndex hilf1 = hilf.pow(StandardMultiply.OP, mu[i], Integer.MAX_VALUE);
        //zykelind_dir_prod_apply(hilf1, ergeb);
        //ergeb = ergeb.op(OP, hilf1);
        ergeb = ergeb.op(StandardMultiply.OP, hilf1);
      }
    }
    final Z hilf = kung_formel(d, mu, q);
    System.out.println("Kung=" + hilf); // sai
    //invers_apply(hilf);
    final Q hilf1 = new Q(Z.ONE, hilf);
    //m_scalar_polynom(hilf, hilf1);
    //mult_apply(hilf1, ergeb);
    ergeb.multiply(hilf1);
//    freeall(hilf);
//    freeall(hilf1);
    //if (erg != OK) error("in computation of zykeltyp_poly_part(d,exp,mu,p,q,ergeb) ");
    return ergeb;
  }

  private final MemoryFactorial mF = new MemoryFactorial();

  /* a ist ein INTEGER objekt.  b ist ein VECTOR objekt. Die Komponenten
  von b sind wieder INTEGER objekte (groesser oder gleich 0). Das Ergebnis
  c ist die Anzahl der moeglichen Anordnungen der Elemente von b. */
  Z fmultinom_ext(final int a,final int[] b) {
//    INT i;
//    OP hilfoben,hilfunten,hilf,hilf1,part;
//    INT erg=OK;
//    CTO(INTEGER,"fmultinom_ext",a);
//    CTTO(INTEGERVECTOR,VECTOR,"fmultinom_ext",b);
//
//
//    hilfoben=callocobject();
//    hilfunten=callocobject();
//    hilf=callocobject();
//    hilf1=callocobject();
//    part=callocobject();
    final int[] part = b;
    //t_VECTOR_EXPONENT(part, part); // todo to count form?
    Z hilfoben = mF.factorial(a);
    //fakul(a,hilfoben);
    Z hilfunten = Z.ONE;
    int hilf1 = 0;
//    M_I_I(1L, hilfunten);
//    M_I_I(0L, hilf1);
    for (int i = 0; i < part.length; ++i) {
      hilf1 += part[i];
      //add_apply(S_PA_I(part, i), hilf1);
      final Z hilf = mF.factorial(part[i]);
      //fakul(S_PA_I(part, i), hilf);
      //mult_apply(hilf, hilfunten);
      hilfunten = hilfunten.multiply(hilf);
    }
    hilf1 = a - hilf1;
    //sub(a, hilf1, hilf1);
    //fakul(hilf1, hilf);
    final Z hilf = mF.factorial(hilf1);
    //mult_apply(hilf, hilfunten);
    hilfunten = hilfunten.multiply(hilf);
    final Z c = hilfoben.divide(hilfunten);
    //div(hilfoben, hilfunten, c);
//    freeall(hilfoben);
//    freeall(hilfunten);
//    freeall(hilf);
//    freeall(hilf1);
//    freeall(part);
//    ENDR("internal func fmultinom_ext");
    return c;
  }


  CycleIndex zykelind_glkq(final int k, final int q) {
    // OP p,null,c,c1,c2,c3,d,hilf,hilf1,zs1,zs2,zs3,zs4,zs5,zs6,v1,v2;
    // long i,j,l;
    //INT erg=OK;
//    p=callocobject();
//    c=callocobject();
//    c1=callocobject();
//    c2=callocobject();
//    c3=callocobject();
//    d=callocobject();
//    hilf=callocobject();
//    hilf1=callocobject();
//    zs1=callocobject();
//    zs2=callocobject();
//    zs3=callocobject();
//    zs4=callocobject();
//    zs5=callocobject();
//    zs6=callocobject();
//    null=callocobject();
//    v1=callocobject();
//    v2=callocobject();
//    final Z p = q.characteristic();
//    if (p == null) {
//      throw new UnsupportedOperationException();
//    }
    //if (charakteristik_bestimmen(q,p)!=OK) return error("in computation of zykelind_glkq(k,q,ergeb)");
    final List<List<Z>> v1 = new ArrayList<>();
    final List<List<Z>> v2 = new ArrayList<>();
    exponenten_bestimmen(k, q, v1, v2);
    //final long nullv = 0L;
    //m_scalar_polynom(nullv,ergeb);
    CycleIndex ergeb = CycleIndex.ZERO.copy();
    ergeb.setName("Z"); // todo temp

    final int[] c = new int[k + 1];
    final IntegerPartition part = new IntegerPartition(k);
    int[] p;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      CycleIndex zs1 = z1("zs1"); //CycleIndex.ONE.copy();
      //zs1.setName("zs1");
      //m_iindex_monom(0L, zs1);
      for (int i = 1; i < c.length; ++i) {  /*3*/
        System.out.printf("Doing c[%d]=%d%n", i-1, c[i]); //sai
        if (c[i] > 0) {  /*4*/
          final int d = i; //   M_I_I(i+1L,d); // I already adjusted i by 1
          CycleIndex zs2 = CycleIndex.ZERO.copy();
          //m_scalar_polynom(nullv, zs2);
          System.out.println(c[i] + " into " + v1.get(i-1).size() + " parts"); // sai
          final NonnegativeIntegerComposition comp = new NonnegativeIntegerComposition(c[i], v1.get(i-1).size());
          int[] c1;
          while ((c1 = comp.next()) != null) {
            System.out.println("c1: " + Arrays.toString(c1)); // sai
            CycleIndex zs3 = CycleIndex.ONE.copy();
            //m_iindex_monom(0L, zs3);
            for (int j = 0; j < c1.length; ++j) { /*6*/
              if (c1[j] != 0L) { /*7*/
                CycleIndex zs4 = CycleIndex.ZERO.copy();
                //m_scalar_polynom(null, zs4);
                // todo be better to have a proper class for this
                //first_part_into_atmost_k_parts(c1[j], v2.get(i - 1).get(j), c2);
                final int pc2k = v2.get(i - 1).get(j).intValueExact();
                System.out.println("c1: Starting integer partitions of " + c1[j] + " " + pc2k);
                final IntegerPartition pc2 = new IntegerPartition(c1[j]);
                //final int[] c2 = new int[pc2k + 1];
                final int[] c2 = new int[c1[j] + 1]; // todo can I use this instead?
                int[] p2; // todo should this c2 be in count form?
                while ((p2 = pc2.next()) != null) {
                  if (p2.length > pc2k) {
                    continue;
                  }
                  IntegerPartition.toCountForm(p2, c2);
                  System.out.println("c2: " + Arrays.toString(c2)); // sai
                  CycleIndex zs5 = CycleIndex.ONE.copy();
                  //m_iindex_monom(0L, zs5);
                  for (int l = 1; l < c2.length; ++l) {  /*9*/ // I made this 1 rather than 0
                    if (c2[l] != 0L) {  /*10*/
                      CycleIndex zs6 = CycleIndex.ZERO.copy();
                      zs6.setName("zs6"); // sai temp
                      final IntegerPartition part3 = new IntegerPartition(c2[l]);
                      int[] p3;
                      final int[] c3 = new int[c2[l] + 1];
                      while ((p3 = part3.next()) != null) {
                        IntegerPartition.toCountForm(p3, c3);
                        System.out.println("c3: " + Arrays.toString(c3)); // sai
                        //first_part_EXPONENT(c2[l], c3);
                      //do {  /*11*/
                        final int characteristic = 2; // todo this should
                        final CycleIndex hilf = zykeltyp_poly_part(d, v1.get(i-1).get(j).intValueExact(), c3, characteristic, q);
                        System.out.println("ykeltyp_poly_part: " + hilf);
                        //add_apply(hilf, zs6);
                        zs6.add(hilf);
                      } //while (next(c3, c3)); /*11*/
                      System.out.println("zs6: " + zs6); //sai
                      zs5 = zs5.op(OP, zs6);
                      //zykelind_dir_prod_apply(zs6, zs5);
                    }  /*10*/
                  }  /*9*/
                  //fmultinom_ext(v2.get(i-1).get(j), c2, hilf);
                  //final Z hilf = SymmetricGroup.per(c2);
                  final Z hilf = fmultinom_ext(v2.get(i-1).get(j).intValueExact(), c2);
                  //final Z hilf = Binomial.multinomial(v2.get(i-1).get(j).intValueExact(), c2);
                  //final Z hilf = Binomial.multinomial(v2.get(i-1).get(j).intValueExact(), p2);
                  System.out.println("multinomial " + v2.get(i-1).get(j).intValueExact() + "; " + Arrays.toString(c2) + " = " + hilf); // sai
//                  m_scalar_polynom(hilf, hilf1);
//                  mult_apply(hilf1, zs5);
                  zs5.multiply(new Q(hilf));
                  //add_apply(zs5, zs4);
                  zs4.add(zs5);
                  System.out.println("zs5: " + zs5); // sai
                  //l = next_part_into_atmost_k_parts(c2);
                } //while (l == 1L); /*8*/
                System.out.println("zs4: " + zs4); // sai
                zs3 = zs3.op(OP, zs4);
                //zykelind_dir_prod_apply(zs4, zs3);
              }  /*7*/
            }  /*6*/
            //add_apply(zs3, zs2);
            System.out.println("zs3: " + zs3); // sai
            zs2.add(zs3);
            //j = next_unordered_part_into_atmost_k_parts(c1);
          } //while (j == 1L); /*5*/
          System.out.println("zs2: " + zs2); // sai
          zs1 = zs1.op(OP, zs2);
          //zykelind_dir_prod_apply(zs2, zs1);
        }  /*4*/
      }  /*3*/
      //add_apply(zs1, ergeb);
      ergeb.add(zs1);
      System.out.println("c=" + Arrays.toString(c)); // sai
      System.out.println("zs1: " + zs1);
      System.out.println(ergeb);
    }
//    freeall(p);
//    freeall(c); 
//    freeall(c1); 
//    freeall(c2);
//    freeall(c3); 
//    freeall(d); 
//    freeall(hilf); 
//    freeall(hilf1);
//    freeall(zs1); 
//    freeall(zs2); 
//    freeall(zs3); 
//    freeall(zs4);
//    freeall(zs5); 
//    freeall(zs6); 
//    freeall(null); 
//    freeall(v1);
//    freeall(v2);
    //ENDR("zykelind_glkq");
    return ergeb;
  }

}
