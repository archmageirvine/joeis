package irvine.oeis.a248;
// manually robots/triprod at 2023-08-09 22:01

import irvine.oeis.a007.A007318;
import irvine.oeis.a028.A028246;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.Product;
import irvine.oeis.triangle.Transpose;

/**
 * A248727 A046802(x,y) --&gt; A046802(x,y+1), transform of e.g.f. for the graded number of positroids of the totally nonnegative Grassmannians G+(k,n); enumerates faces of the stellahedra.
 * @author Georg Fischer
 */
public class A248727 extends Product {

  /** Construct the sequence. */
  public A248727() {
    super(0, MemorySequence.cachedSequence(new A007318()), MemorySequence.cachedSequence(new Transpose(1, new A028246())));
  }
}
