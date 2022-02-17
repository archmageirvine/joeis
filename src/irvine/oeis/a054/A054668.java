package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054668 Number of distinct non-extendable sequences X={x(1),x(2),...,x(k)} where x(1)=1, the x(i)'s are distinct elements of {1,...,n} with |x(i)-x(i+1)|=1 or 2, for i=1,2,...,k.
 * @author Sean A. Irvine
 */
public class A054668 implements Sequence {

  // After Vladimir Joseph Stephan Orlovsky

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      mC = Z.ZERO;
      return Z.ONE;
    }
    final Z t = mA.add(mB).add(mC).add(2);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

