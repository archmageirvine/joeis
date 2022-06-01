package irvine.oeis.a056;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A056762 Number of terms in A056761 (i.e., odd numbers from A056757) between 2^(n-1) and 2^n.
 * @author Sean A. Irvine
 */
public class A056762 extends PrependSequence {

  /** Construct the sequence. */
  public A056762() {
    super(new PeriodicSequence(0), 0, 1, 2, 2, 3, 8, 5, 12, 19, 13, 25, 31, 22, 33, 28, 17, 24, 12, 6, 4);
  }
}
