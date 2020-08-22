package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261484 Number of set partitions of [n] into exactly eight parts such that no part contains two elements with a circular distance less than three.
 * @author Sean A. Irvine
 */
public class A261484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261484() {
    super(new long[] {-518400, -518400, -496944, 276192, 584696, 496104, 352921, -91944, 26684, -127043, 30709, -28574, 17289, -5291, 2800, -973, 231, -70, 14}, new long[] {1, 18, 210, 1980, 16467, 126126, 912338, 6332055, 42615547, 280182355, 1809148533, 11517941151L, 72515126734L, 452500330899L, 2803547693199L, 17270035728605L, 105888136423278L, 646765377652715L, 3938163632325325L});
  }
}
