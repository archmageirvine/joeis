package irvine.oeis.a023;

/**
 * A023095 a(n) is the least k &gt; 0 such that k and 3k are anagrams in base n (written in base 10).
 * @author Sean A. Irvine
 */
public class A023095 extends A023094 {

  @Override
  protected int multiple() {
    return 3;
  }
}
