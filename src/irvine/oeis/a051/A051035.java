package irvine.oeis.a051;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a025.A025583;

/**
 * A051035 Composite numbers which can be represented as the sum of two primes (i.e., A002808 excluding A025583).
 * @author Sean A. Irvine
 */
public class A051035 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A051035() {
    super(new A002808(), new A025583());
  }
}
