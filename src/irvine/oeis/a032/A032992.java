package irvine.oeis.a032;

/**
 * A032992 If d,e are consecutive digits of n in base 10, then |d-e|&gt;=4.
 * @author Sean A. Irvine
 */
public class A032992 extends A032988 {

  @Override
  protected int base() {
    return 10;
  }
}
