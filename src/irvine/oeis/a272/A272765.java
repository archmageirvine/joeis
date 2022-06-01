package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272765 Expansion of (1 + 80*x + 2592*x^2 + 29360*x^3 + 138124*x^4 + 295552*x^5 + 299984*x^6 + 144016*x^7 + 31146*x^8 + 2688*x^9 + 72*x^10)/(1-x)^16.
 * @author Sean A. Irvine
 */
public class A272765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272765() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {1, 96, 4008, 82528, 1029552, 8939152, 59112616, 316345408, 1429655844, 5627681904L, 19747867728L, 62882889360L, 184259252180L, 502404837648L, 1286281062776L, 3115358788304L});
  }
}
