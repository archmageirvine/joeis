package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016868 (5n+1)^8.
 * @author Sean A. Irvine
 */
public class A016868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016868() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 1679616, 214358881, 4294967296L, 37822859361L, 208827064576L, 852891037441L, 2821109907456L, 7984925229121L});
  }
}
