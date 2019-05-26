package irvine.oeis.a023;

/**
 * A023101 <code>a(n)</code> is least k such that k and <code>9k</code> are anagrams in base <code>n</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023101 extends A023094 {

  @Override
  protected int multiple() {
    return 9;
  }
}
