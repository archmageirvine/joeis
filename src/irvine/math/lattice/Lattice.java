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
   * Return the number of neighbours of the specified point.
   * @param point a point
   * @return the number of neighbours of the point
   */
  int neighbourCount(final long point);

  /**
   * Return the specified neighbour of the specified point.
   * @param point the point
   * @param neighbourNumber the neighbour number
   * @return array of neighbours
   */
  long neighbour(final long point, final int neighbourNumber);

  /**
   * Return an array containing all the immediate neighbours of a point.
   * @param point the point
   * @return array of neighbours
   */
  long[] neighbours(final long point);
}
