package irvine.oeis.a060;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002778;
import irvine.oeis.a059.A059744;

/**
 * A060087 Numbers k such that k^2 is a palindromic square with an asymmetric root.
 * @author Sean A. Irvine
 */
public class A060087 extends FilterSequence {

  /** Construct the sequence. */
  public A060087() {
    super(1, new A002778(), k -> A059744.isAsymmetricRootFamily(k.toString()));
  }
}
