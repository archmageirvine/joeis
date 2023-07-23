package irvine.oeis.a063;

import irvine.oeis.a000.A000052;
import irvine.util.string.Italian;

/**
 * A063761 Arrange 1-digit numbers in alphabetical order in Italian, then the 2-digit numbers, then the 3-digit numbers, etc.
 * @author Sean A. Irvine
 */
public class A063761 extends A000052 {

  {
    setOffset(0);
  }

  /** Construct the sequence. */
  public A063761() {
    super(Italian.SINGLETON);
  }
}
