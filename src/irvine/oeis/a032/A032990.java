package irvine.oeis.a032;

/**
 * A032990 If d,e are consecutive digits of n in base 8, then |d-e|&gt;=4.
 * @author Sean A. Irvine
 */
public class A032990 extends A032988 {

  @Override
  protected int base() {
    return 8;
  }
}
