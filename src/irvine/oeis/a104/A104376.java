package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104376 a(n) = n^13 + n^12 + n^11 + n^10 + n^9 + n^8 + n^7 + n^6 + n^5 + n^4 + n^3 + n^2 + n^1 + 1.
 * @author Sean A. Irvine
 */
public class A104376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104376() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3432, -3003, 2002, -1001, 364, -91, 14}, new long[] {1, 14, 16383, 2391484, 89478485, 1525878906, 15672832819L, 113037178808L, 628292358729L, 2859599056870L, 11111111111111L, 37974983358324L, 116719860413533L, 328114698808274L});
  }
}
