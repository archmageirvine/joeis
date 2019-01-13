package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017205.
 * @author Sean A. Irvine
 */
public class A017205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017205() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {19683, 5159780352L, 794280046581L, 19683000000000L, 208728361158759L, 1352605460594688L, 6351461955384057L, 23762680013799936L, 75084686279296875L, 208215748530929664L});
  }
}
