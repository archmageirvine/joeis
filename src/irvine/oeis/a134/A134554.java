package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A134554 Concatenate the terms of three copies of the Fibonacci sequence.
 * @author Georg Fischer
 */
public class A134554 extends Sequence0 {

  private final A000045 mSeq = new A000045();

  @Override
  public Z next() {
    final String s = mSeq.next().toString();
    return new Z(s + s + s);
  }
}
