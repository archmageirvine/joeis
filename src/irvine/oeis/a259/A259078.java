package irvine.oeis.a259;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A259078 Heptagonal numbers (A000566) that are other heptagonal numbers divided by 2.
 * @author Sean A. Irvine
 */
public class A259078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259078() {
    super(1, new long[] {1, -1536796803, 1536796803},
      new Z[] {
        Z.valueOf(6426),
        Z.valueOf(9875715583923L),
        new Z("15176968126834688342280")
    });
  }
}
