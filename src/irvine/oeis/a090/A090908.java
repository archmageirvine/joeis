package irvine.oeis.a090;
// Generated by patch_prepend.pl 2023-06-19 07:07

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;

/**
 * A090908 Terms a(k) of A073869 for which a(k) is distinct from a(k-1).
 * @author Georg Fischer
 */
public class A090908 extends PrependSequence {

  /** Construct the sequence. */
  public A090908() {
    super(1, new A000201().skip(1), 1);
  }
}
