package irvine.oeis.a062;

import irvine.oeis.FiniteSequence;

/**
 * A062002 Gamma_0(n) has genus 0 and does not contain <code>any</code> elliptic elements.
 * @author Georg Fischer
 */
public class A062002 extends FiniteSequence {

  /** Construct the sequence. */
  public A062002() {
    super(4, 6, 8, 9, 12, 16, 18);
  }
}
