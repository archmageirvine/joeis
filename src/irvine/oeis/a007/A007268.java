package irvine.oeis.a007;

/**
 * A007268 Number of partition graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A007268 extends A007269 {

  /** Construct the sequence. */
  public A007268() {
    super((graph, n) -> graph.order() == n && graph.order() != 2);
  }
}

