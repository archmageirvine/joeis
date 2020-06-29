package irvine.oeis.a032;

/**
 * A032991 If d,e are consecutive digits of n in base 9, then <code>|d-e|&gt;=4</code>.
 * @author Sean A. Irvine
 */
public class A032991 extends A032988 {

  @Override
  protected int base() {
    return 9;
  }
}
