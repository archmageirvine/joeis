package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A073439 Numbers k such that A073259(k)=4: the length of iteration-transient leading to k-th composite number equals 4.
 * @author Sean A. Irvine
 */
public class A073439 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073439() {
    super(1, new A073259(), Z.FOUR::equals);
  }
}
