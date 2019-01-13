package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A106176.
 * @author Sean A. Irvine
 */
public class A106176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106176() {
    super(new long[] {1, -1, 0, 0, 0, 0, -9542163854L, 9542163854L, 0, 0, 0, 0, 1},
      new Z[] {Z.ZERO, Z.valueOf(16), Z.valueOf(1440), Z.valueOf(389295), Z.valueOf(33994015), Z.valueOf(1802660535), Z.valueOf(2968421391L), Z.valueOf(157411709575L), Z.valueOf(13745486642391L), Z.valueOf(3714721448623416L), Z.valueOf(324376465956415720L), new Z("17201282202880383816"), new Z("28325163305411682840")});
  }
}
