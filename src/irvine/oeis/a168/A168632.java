package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168632.
 * @author Sean A. Irvine
 */
public class A168632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168632() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {0, 1, 8224, 2391849, 134219776, 3051765625L, 39182105376L, 339111595249L, 2199023386624L, 11438396493201L, 50000000500000L, 189874917677401L, 641959233767424L, 1968688195263049L, 5556003416543776L});
  }
}
