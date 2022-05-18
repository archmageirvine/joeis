package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A046791 A046790 has several definitions, one of which is: "Numbers i such that there is a smaller positive number j such that (i+j)/2 and sqrt(i*j) are integers". The present sequence gives the smallest choice for j.
 * @author Sean A. Irvine
 */
public class A046791 extends A046790 {

  // After David A. Corneth

  @Override
  public Z next() {
    final Z n = super.next();
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow(fs.getExponent(p) & 1));
    }
    return n.isEven() && prod.isOdd() ? prod.multiply(4) : prod;
  }
}
