package irvine.math.lattice;

/**
 * Defines some basic functionality for a lattice and operations on points within the
 * lattice.  Points are represented by longs (which internally can contain packed
 * coordinates).
 * @author Sean A. Irvine
 */
public interface Lattice {

  /**
   * Return the unique point corresponding to the origin.
   * @return the origin
   */
  long origin();

  /**
   * Return the dimension of the lattice. More specifically return the number of
   * ordinates used to specify a point in the coordinate system associated with this
   * representation of the lattice.
   * @return dimension of the lattice
   */
  int dimension();

  /**
   * Return the squared-distance of the specified point from the origin.  Normally
   * this will be the squared-Euclidean distance.
   * @param point the point
   * @return distance squared
   */
  long norm(final long point);

  /**
   * Return a string representation of a point.  For example, in a two-dimensional
   * lattice, a string like <code>(-2,42)</code> representing the <code>x</code>
   * and <code>y</code> coordinates of the point.
   * @param point the point
   * @return string representation of the point
   */
  String toString(final long point);

  /**
   * Return the specified ordinate of the given point.  For example, in a two-dimensional
   * lattice, <code>ordinate(p, 0)</code> and <code>ordinate(p, 1)</code> can be thought
   * of as <code>x</code> and <code>y</code> coordinates, respectively.
   * @param point the point
   * @param ordinate ordinate number
   * @return the specified ordinate
   */
  long ordinate(final long point, final int ordinate);

  /**
   * Return an array containing all the immediate neighbours of a point.  The memory
   * associated with the return will be newly allocated.
   * @param point the point
   * @return array of neighbours
   */
  long[] neighbours(final long point);

  /**
   * Return an array containing all the immediate neighbours of a point.  The returned
   * array will be the same as that provided as an argument.  It is assumed that the
   * workspace is of sufficient size to store all neighbours of the point.  If the
   * array is longer than necessary, then subsequent values are not modified.
   * This method is provided for performance reasons, allowing memory to be reused.
   * @param workspace memory in which to store the result
   * @param point the point
   * @return array of neighbours
   */
  long[] neighbours(final long[] workspace, final long point);
}
