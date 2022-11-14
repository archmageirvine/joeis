package irvine.oeis.a195;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195304.
 * @author Sean A. Irvine
 */
public class A195304 extends DecimalExpansionSequence {

  /*
     f:=(a,b,t)->(t - a)^2 + ((t - a)^2)*((a*(b/3) - b*t)/(a*(2*a/3) - a*t))^2
     factor(diff(f(a,b,x),x));
                                   5       4         3  2      3  2       2  2         2  3       2  2         2  3
                     2 (x - a) (8 a  - 36 a  x + 54 a  x  + 5 a  b  - 27 a  b  x - 27 a  x  + 45 b  x  a - 27 b  x )
                     -----------------------------------------------------------------------------------------------
                                                             2            3
                                                            a  (2 a - 3 x)
   */

  private static CR build(final long a, final long b) {
    // Assumes a and b not too large, so that things like a^5 can be computed in long

    // deriv(f(a,b,x), x)
    final UnaryCRFunction df = new UnaryCRFunction() {
      @Override
      public CR execute(final CR x) {
        final CR aa = CR.valueOf(a);
        final CR u = x.multiply(-27 * (a * a + b * b))                           // x^3
          .add(CR.valueOf(45 * b * b * a + 54 * a * a * a)).multiply(x)          // x^2
          .add(CR.valueOf(-27 * a * a * b * b - 36 * a * a * a * a)).multiply(x) // x^1
          .add(CR.valueOf(5 * a * a * a * b * b + 8 * a * a * a * a * a));       // x^0
        final CR num = u.multiply(x.subtract(aa)).multiply(CR.TWO);
        final CR den = CR.valueOf(2 * a).subtract(x.multiply(3)).pow(3).multiply(CR.valueOf(a * a));
        return num.divide(den);
      }
    };

    final UnaryCRFunction f = new UnaryCRFunction() {
      @Override
      public CR execute(final CR x) {
        // f(x) = (x - a)^2 +  (x - a)^2 * ((a*k - b*x)/(a*h - a*x))^2;
        final CR h = CR.valueOf(2 * a).divide(CR.THREE);
        final CR k = CR.valueOf(b).divide(CR.THREE);
        final CR cra = CR.valueOf(a);
        final CR xa2 = x.subtract(cra).square();
        final CR akbx = cra.multiply(k).subtract(x.multiply(b));
        final CR ahax = h.subtract(x).multiply(cra);
        return xa2.add(xa2.multiply(akbx.divide(ahax).square()));
      }
    };

    System.out.println("f(0)=" + f.execute(CR.ZERO));
    System.out.println("f(1)=" + f.execute(CR.ONE));
    System.out.println("Df(0)=" + df.execute(CR.ZERO));
    System.out.println("Df(1)=" + df.execute(CR.ONE));
    System.out.println("Df(1.183642761)=" + df.execute(CR.valueOf(1.183642761))); // should be almost 0 for a=3, b=4

    /*
      Of the following solutions, apparently 1.18... is the one we want:
           evalf(solve(diff(f(3,4,x),x)=0));
             3., 1.183642761, 2.088178620 - 0.8810193187 I, 2.088178620 + 0.8810193187 I
     */

    // Note: These bounds for the root of the derivative (1,1.5) may need to be parameters
    final CR x = df.inverseMonotone(CR.ONE, CR.valueOf(1.5)).execute(CR.ZERO);
    System.out.println("root(Df) = " + x);
    return f.execute(x).sqrt();
  }

  /** Construct the sequence. */
  public A195304(final long a, final long b) {
    super(0, build(a, b));
  }

  /** Construct the sequence. */
  public A195304() {
    this(3, 4);
  }
}
