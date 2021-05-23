package irvine.oeis.a047;

import irvine.oeis.SkipSequence;
import irvine.oeis.a016.A016038;

/**
 * A047811 Numbers n &gt;= 4 that are not palindromic in any base b, 2 &lt;= b &lt;= n/2.
 * @author Sean A. Irvine
 */
public class A047811 extends SkipSequence {

  /** Construct the sequence. */
  public A047811() {
    super(new A016038(), 4);
  }
}
