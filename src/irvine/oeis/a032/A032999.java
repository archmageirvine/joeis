package irvine.oeis.a032;

/**
 * A032999 If d,e are consecutive digits of n in base 11, then |d-e|&gt;=5.
 * @author Sean A. Irvine
 */
public class A032999 extends A032995 {

  @Override
  protected int base() {
    return 11;
  }
}
