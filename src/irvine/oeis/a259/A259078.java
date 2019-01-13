package irvine.oeis.a259;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A259078.
 * @author Sean A. Irvine
 */
public class A259078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259078() {
    super(new long[] {1, -1536796803, 1536796803},
      new Z[] {
        Z.valueOf(6426),
        Z.valueOf(9875715583923L),
        new Z("15176968126834688342280")
    });
  }
}
