package irvine.oeis.a023;

/**
 * A023096 Least k such that k and <code>4k</code> are anagrams in base <code>n</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023096 extends A023094 {

  @Override
  protected int multiple() {
    return 4;
  }
}
