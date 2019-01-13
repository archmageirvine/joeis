package irvine.oeis.a168;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A168694.
 * @author Sean A. Irvine
 */
public class A168694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168694() {
    super(new long[] {-120, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15},
      new Z[] {
        Z.ONE,
        Z.valueOf(17),
        Z.valueOf(272),
        Z.valueOf(4352),
        Z.valueOf(69632),
        Z.valueOf(1114112),
        Z.valueOf(17825792),
        Z.valueOf(285212672),
        Z.valueOf(4563402752L),
        Z.valueOf(73014444032L),
        Z.valueOf(1168231104512L),
        Z.valueOf(18691697672192L),
        Z.valueOf(299067162755072L),
        Z.valueOf(4785074604081152L),
        Z.valueOf(76561193665298432L),
        Z.valueOf(1224979098644774912L),
        new Z("19599665578316398592")
      });
  }
}
