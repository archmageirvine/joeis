package irvine.oeis.a097;

import irvine.oeis.a000.A000052;
import irvine.util.string.Spanish;

/**
 * A097960 Arrange 1-digit numbers in Spanish in alphabetical order, then 2-digit numbers, then 3-digit numbers, etc.
 * @author Sean A. Irvine
 */
public class A097960 extends A000052 {

  /** Construct the sequence. */
  public A097960() {
    super(Spanish.SINGLETON);
  }

  @Override
  protected String remap(final String s) {
    return s.replace('\u00E9', 'e').replace('\u00F3', 'o');
  }
}
