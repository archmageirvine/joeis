package irvine.oeis.a076;

import irvine.oeis.FilterSequence;
import irvine.oeis.a056.A056525;

/**
 * A076609 Palindromic numbers with prime middle digit.
 * @author Sean A. Irvine
 */
public class A076609 extends FilterSequence {

  /** Construct the sequence. */
  public A076609() {
    super(1, new A056525(), k -> {
      final String s = k.toString();
      return "2357".indexOf(s.charAt(s.length() / 2)) >= 0;
    });
  }
}
