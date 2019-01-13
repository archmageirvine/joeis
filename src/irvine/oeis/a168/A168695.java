package irvine.oeis.a168;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A168695.
 * @author Sean A. Irvine
 */
public class A168695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168695() {
    super(new long[] {-136, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16},
      new Z[] {Z.ONE, Z.valueOf(18), Z.valueOf(306), Z.valueOf(5202), Z.valueOf(88434), Z.valueOf(1503378), Z.valueOf(25557426), Z.valueOf(434476242), Z.valueOf(7386096114L), Z.valueOf(125563633938L), Z.valueOf(2134581776946L), Z.valueOf(36287890208082L), Z.valueOf(616894133537394L), Z.valueOf(10487200270135698L), Z.valueOf(178282404592306866L), Z.valueOf(3030800878069216722L), new Z("51523614927176684274")});
  }
}
