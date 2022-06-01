package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291893 Number of symmetrically unique Dyck paths of semilength n and height nine.
 * @author Sean A. Irvine
 */
public class A291893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291893() {
    super(new long[] {-25, 550, -3805, 11180, -11610, -11230, 38529, -27364, -13587, 31128, -13608, -5004, 7022, -2154, -339, 428, -129, 18}, new long[] {1, 9, 89, 639, 4082, 23191, 122381, 607944, 2887756, 13229876, 58898404, 256121253, 1092452270, 4585149401L, 18985099139L, 77707979700L, 314944855135L, 1265638606115L});
  }
}
