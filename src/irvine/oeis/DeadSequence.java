package irvine.oeis;

import irvine.math.z.Z;

/**
 * Place holder for a dead sequence.
 * @author Sean A. Irvine
 */
public class DeadSequence implements Sequence {
  @Override
  public Z next() {
    System.err.println("Sequence has keyword: dead");
    return null;
  }
}
