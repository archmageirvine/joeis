package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291892 Number of symmetrically unique Dyck paths of semilength n and height eight.
 * @author Sean A. Irvine
 */
public class A291892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291892() {
    super(new long[] {25, -275, 405, 1925, -5665, 3445, 4096, -6220, 1447, 1985, -1436, 160, 178, -84, 15}, new long[] {1, 8, 71, 461, 2706, 14235, 70161, 327469, 1469596, 6389144, 27097948, 112630404, 460511702, 1857372265, 7406424903L});
  }
}
