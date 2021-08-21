package irvine.oeis.a050;

/**
 * A050876 Base 3 numbers d(1)...d(j) such that d(i)&lt;&gt;d(j+1-i) for all but 2 i.
 * @author Sean A. Irvine
 */
public class A050876 extends A050874 {

  @Override
  protected int target() {
    return 2;
  }

  @Override
  protected int base() {
    return 3;
  }
}
