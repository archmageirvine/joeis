package irvine.oeis.a076;

import irvine.oeis.FilterSequence;
import irvine.oeis.a056.A056525;

/**
 * A076612 Palindromic numbers with nonprime middle digit.
 * @author Sean A. Irvine
 */
public class A076612 extends FilterSequence {

  /** Construct the sequence. */
  public A076612() {
    super(1, new A056525(), k -> {
      final String s = k.toString();
      return "2357".indexOf(s.charAt(s.length() / 2)) < 0;
    });
  }
}
