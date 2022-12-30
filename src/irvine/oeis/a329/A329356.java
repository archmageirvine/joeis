package irvine.oeis.a329;
// manually 2022-12-26

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A329356 The binary expansion of a(n) is the first n terms of 2 - A000002.
 * @author Georg Fischer
 */
public class A329356 extends Sequence0 {

  private final A329360 mSeq = new A329360();

  @Override
  public Z next() {
    return new Z(mSeq.next().toString().replaceAll("2", "0"), 2);
  }
}
