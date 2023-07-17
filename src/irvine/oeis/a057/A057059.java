package irvine.oeis.a057;
// manually A057036/parmof4 at 2023-07-17 09:13

/**
 * A057059 Let R(i,j) be the rectangle with antidiagonals 1; 2,3; 4,5,6; ... Define i(m) and j(m) by R(i(m),j(m)) = m. Then a(n) = j(A057027(n)).
 * @author Georg Fischer
 */
public class A057059 extends A057036 {

  /** Construct the sequence. */
  public A057059() {
    super(1, new A057027(), 2, 0);
  }
}
