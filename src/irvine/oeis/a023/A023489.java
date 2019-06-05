package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a001.A001690;

/**
 * A023489 Sum of n-th Lucas number greater than 3 and n-th number that is 1 or is not a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A023489 extends A000204 {

  final Sequence mA = new PrependSequence(new A001690(), 1);
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
