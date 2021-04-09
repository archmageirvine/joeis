package irvine.oeis.a046;

/**
 * A046384 Palindromes with exactly 10 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046384 extends A046380 {

  @Override
  protected int targetOmega() {
    return 10;
  }
}
