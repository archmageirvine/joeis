package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A046812 Number of prime anagrams of A046811(n).
 * @author Sean A. Irvine
 */
public class A046812 extends AbstractSequence {

  private final A046811 mSeq1 = new A046811();

  /** Construct the sequence. */
  public A046812() {
    super(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(A046810.numberOfPrimeAnagrams(mSeq1.next().toString()));
  }
}
