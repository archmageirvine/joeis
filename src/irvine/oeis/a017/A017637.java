package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017637 <code>(12n+9)^9</code>.
 * @author Sean A. Irvine
 */
public class A017637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017637() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {387420489, 794280046581L, 46411484401953L, 756680642578125L, 6351461955384057L, 35452087835576229L, 150094635296999121L, 520411082988487293L, 1551328215978515625L, 4108400332687853397L});
  }
}
