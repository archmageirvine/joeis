package irvine.oeis.a329;
// manually 2022-12-26

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A329355 The binary expansion of a(n) is the second through n-th terms of A000002 - 1.
 * @author Georg Fischer
 */
public class A329355 extends Sequence1 {

  private final A329360 mSeq = new A329360();

  /** Construct the sequence. */
  public A329355() {
    mSeq.next();
  }

  @Override
  public Z next() {
    return new Z("0" + mSeq.next().toString().substring(1).replaceAll("1", "0").replaceAll("2", "1"), 2);
  }
}
