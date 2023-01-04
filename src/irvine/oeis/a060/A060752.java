package irvine.oeis.a060;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a057.A057984;

/**
 * A060752 These numbers are the record number of steps for the numbers in A060751 to reach the top of the deck in Guy's shuffle (see A060750).
 * @author Sean A. Irvine
 */
public class A060752 extends PrependSequence {

  /** Construct the sequence. */
  public A060752() {
    super(new SkipSequence(new A057984(), 3), 3);
  }
}
