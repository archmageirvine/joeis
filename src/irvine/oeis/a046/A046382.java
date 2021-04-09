package irvine.oeis.a046;

/**
 * A046382 Palindromes with exactly 8 prime factors (counted with multiplicity) each of which is a palindrome.
 * @author Sean A. Irvine
 */
public class A046382 extends A046380 {

  @Override
  protected int targetOmega() {
    return 8;
  }
}
