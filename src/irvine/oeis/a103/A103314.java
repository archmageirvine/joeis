package irvine.oeis.a103;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A103314 Total number of subsets of the n-th roots of 1 that add to zero.
 * @author Sean A. Irvine
 */
public class A103314 extends Sequence0 {

  // After Max Alekseyev and M. F. Hasler

  private int mN = -1;

  private Z a(final int n) {
    if (n < 2) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.bigOmega() == 1) {
      return Z.TWO;
    }
    if (fs.maxExponent() > 1) {
      final int f = fs.squareFreeKernel().intValueExact();
      return a(f).pow(n / f);
    }
    final Z[] p = fs.toZArray();
    if (p.length == 2) {
      return Z.TWO.pow(p[0]).add(Z.TWO.pow(p[1])).subtract(2);
    }
    if (p.length == 3 && Z.TWO.equals(p[0])) {
      return Integers.SINGLETON.sum(0, p[1].intValueExact(), j -> Binomial.binomial(p[1], j).multiply(Z.TWO.pow(j).add(Z.TWO.pow(p[1].subtract(j))).pow(p[2])))
        .add(Z.TWO.pow(p[1]).add(2).pow(p[2]))
        .add(Z.TWO.pow(p[2]).add(2).pow(p[1]))
        .subtract(Z.TWO.pow(p[1]).add(1).pow(p[2]).add(Z.TWO.pow(p[2]).add(1).pow(p[1])).multiply2())
        .add(Z.TWO.pow(p[1].multiply(p[2])));
    }
    if (n == 105) {
      return Z.valueOf(166093023482L);
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

/*

(PARI)
A103314(n) = { local(f=factor(n)); n<2 & return(1); n==f[1, 1] & return(2);
vecmax(f[, 2])>1 & return(A103314(f=prod(i=1, #f~, f[i, 1]))^(n/f));
if( 2==#f=f[, 1], return(2^f[1]+2^f[2]-2));
#f==3 & f[1]==2 & return(sum(j=0, f[2], binomial(f[2], j)*(2^j+2^(f[2]-j))^f[3])
+(2^f[2]+2)^f[3]+(2^f[3]+2)^f[2]-2*((2^f[2]+1)^f[3]+(2^f[3]+1)^f[2])+2^(f[2]*f[3]));
n==105 & return(166093023482); error("A103314(n) is unknown for n=", n) }
 */
