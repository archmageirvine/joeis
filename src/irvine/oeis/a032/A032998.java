package irvine.oeis.a032;

/**
 * A032998 If d,e are consecutive digits of n in base 10, then |d-e|&gt;=5.
 * @author Sean A. Irvine
 */
public class A032998 extends A032995 {

  @Override
  protected int base() {
    return 10;
  }
}
