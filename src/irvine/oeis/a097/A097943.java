package irvine.oeis.a097;

import irvine.oeis.a000.A000052;
import irvine.util.string.Danish;

/**
 * A097943 Arrange 1-digit numbers in Danish in alphabetical order, then 2-digit numbers, then 3-digit numbers etc.
 * @author Sean A. Irvine
 */
public class A097943 extends A000052 {

  /** Construct the sequence. */
  public A097943() {
    super(Danish.SINGLETON);
  }
}
