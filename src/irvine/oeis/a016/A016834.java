package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016834 (4n+2)^10.
 * @author Sean A. Irvine
 */
public class A016834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016834() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1024, 60466176, 10000000000L, 289254654976L, 3570467226624L, 26559922791424L, 141167095653376L, 590490000000000L, 2064377754059776L, 6278211847988224L, 17080198121677824L});
  }
}
