package irvine.oeis.a101;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;
import irvine.oeis.a009.A009112;

/**
 * A101450 Areas of (not necessarily primitive) Pythagorean triangles which are palindromes.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A101450 extends FilterSequence {

  /** Construct the sequence. */
  public A101450() {
    super(1, new A002113(), A009112::is);
  }
}
