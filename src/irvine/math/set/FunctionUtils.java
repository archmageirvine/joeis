package irvine.math.set;

import irvine.math.api.Set;
import irvine.math.factorial.BinarySplitFactorial;
import irvine.math.z.BellNumbers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;

/**
 * Utility functions associated with functions.
 *
 * @author Sean A. Irvine
 */
public final class FunctionUtils {

  private FunctionUtils() { }

  /**
   * The number of possible functions from a set of specified size
   * to another set with null indicating an infinite number.
   * @param domainSize domain (null for infinite)
   * @param codomainSize codomain (null for infinite)
   * @return number of mappings
   */
  public static Z numberFunctions(final Z domainSize, final Z codomainSize) {
    // |codomain|^|domain|.
    // Some care needed to handle infinities properly.
    if (codomainSize == null) {
      // codomain is infinite, so each element of the domain can go
      // to an infinite number of possible, thus the only special
      // case is when the domain is empty.
      return domainSize.isZero() ? Z.ONE : null;
    }
    if (domainSize == null) {
      // If the codomain is empty, we cannot form any mapping.
      // If the codomain is size one, there is precisely one mapping.
      // Otherwise there are codomain choices for each of the infinite
      // domain elements.
      return codomainSize.compareTo(Z.TWO) < 0 ? codomainSize : null;
    }
    return codomainSize.pow(domainSize);
  }

  /**
   * The number of possible functions from the domain to codomain.
   * A null return indicates an infinite number.
   * @param domain domain (possibly infinite)
   * @param codomain codomain (possibly infinite)
   * @return number of mappings
   */
  public static Z numberFunctions(final Set<?> domain, final Set<?> codomain) {
    return numberFunctions(domain.size(), codomain.size());
  }

  /**
   * The number of possible onto functions from a set of specified size
   * to another set with null indicating an infinite number.
   * @param domainSize domain size (null for infinite)
   * @param codomainSize codomain size (null for infinite)
   * @return number of mappings
   */
  public static Z numberOntoFunctions(final Z domainSize, final Z codomainSize) {
    // m!{n, m}
    // Some care needed to handle infinities properly.
    if (domainSize == null) {
      // Infinite domain and codomain has infinite possible mappings
      if (codomainSize == null) {
        return null;
      }
      // Infinite domain with empty or singleton range is very limited
      return codomainSize.compareTo(Z.TWO) < 0 ? codomainSize : null;
    }
    if (codomainSize == null || domainSize.compareTo(codomainSize) < 0) {
      // n < m, can't ever be onto
      return Z.ZERO;
    }
    if (codomainSize.bitLength() > 31) {
      throw new UnsupportedOperationException();
    }
    final long n = domainSize.longValueExact();
    final long m = codomainSize.longValue();
    return Stirling.secondKind(n, m).multiply(new BinarySplitFactorial().factorial((int) m));
  }

  /**
   * The number of possible onto functions from the domain to codomain.
   * A null return indicates an infinite number.
   * @param domain domain (possibly infinite)
   * @param codomain codomain (possibly infinite)
   * @return number of mappings
   */
  public static Z numberOntoFunctions(final Set<?> domain, final Set<?> codomain) {
    return numberOntoFunctions(domain.size(), codomain.size());
  }

  /**
   * The number of possible one-to-one functions from a set of specified size
   * to another set with null indicating an infinite number.
   * @param domainSize domain size (null for infinite)
   * @param codomainSize codomain size (null for infinite)
   * @return number of mappings
   */
  public static Z numberOneToOneFunctions(final Z domainSize, final Z codomainSize) {
    if (domainSize == null) {
      return codomainSize == null ? null : Z.ZERO;
    }
    if (codomainSize == null) {
      return domainSize.isZero() ? Z.ONE : null;
    }
    if (codomainSize.equals(domainSize)) {
      // This special case is a speed optimization
      return new BinarySplitFactorial().factorial(codomainSize.intValueExact());
    }
    Z fallingFactorial = Z.ONE;
    for (Z k = Z.ZERO, j = codomainSize; k.compareTo(domainSize) < 0; k = k.add(1), j = j.subtract(1)) {
      fallingFactorial = fallingFactorial.multiply(j);
    }
    return fallingFactorial;
  }

  /**
   * The number of possible one-to-one functions from the domain to codomain.
   * A null return indicates an infinite number.
   * @param domain domain (possibly infinite)
   * @param codomain codomain (possibly infinite)
   * @return number of mappings
   */
  public static Z numberOneToOneFunctions(final Set<?> domain, final Set<?> codomain) {
    return numberOneToOneFunctions(domain.size(), codomain.size());
  }

  /**
   * The number of binary operations on a set of the specified size.
   * A null return indicates an infinite number.
   * @param domainSize size of domain (possibly infinite)
   * @return number of operations
   */
  public static Z numberBinaryOperations(final Z domainSize) {
    if (domainSize == null) {
      return null;
    }
    return domainSize.pow(domainSize.square());
  }

  /**
   * The number of binary operations on a set.
   * A null return indicates an infinite number.
   * @param domain domain (possibly infinite)
   * @return number of operations
   */
  public static Z numberBinaryOperations(final Set<?> domain) {
    return numberBinaryOperations(domain.size());
  }

  /**
   * The number of commutative binary operations on a set of the specified size.
   * A null return indicates an infinite number.
   * @param domainSize size of domain (possibly infinite)
   * @return number of operations
   */
  public static Z numberCommutativeBinaryOperations(final Z domainSize) {
    if (domainSize == null) {
      return null;
    }
    return domainSize.pow(domainSize.multiply(domainSize.add(1)).divide(2));
  }

  /**
   * The number of commutative binary operations on a set.
   * A null return indicates an infinite number.
   * @param domain domain (possibly infinite)
   * @return number of operations
   */
  public static Z numberCommutativeBinaryOperations(final Set<?> domain) {
    return numberCommutativeBinaryOperations(domain.size());
  }

  /**
   * The number of binary operations with an identity on a set of the specified size.
   * A null return indicates an infinite number.
   * @param domainSize size of domain (possibly infinite)
   * @return number of operations
   */
  public static Z numberBinaryOperationsWithIdentity(final Z domainSize) {
    if (domainSize == null) {
      return null;
    }
    return domainSize.pow(domainSize.subtract(1).square().add(1));
  }

  /**
   * The number of binary operations with an identity on a set.
   * A null return indicates an infinite number.
   * @param domain domain (possibly infinite)
   * @return number of operations
   */
  public static Z numberBinaryOperationsWithIdentity(final Set<?> domain) {
    return numberBinaryOperationsWithIdentity(domain.size());
  }

  /**
   * The number of equivalence relations on a set of the specified size.
   * A null return indicates an infinite number.
   * @param domainSize size of domain (possibly infinite)
   * @return number of operations
   */
  public static Z numberEquivalenceRelations(final Z domainSize) {
    if (domainSize == null) {
      return null;
    }
    return BellNumbers.bell(domainSize.intValueExact());
  }

  /**
   * The number of equivalence relations on a set.
   * A null return indicates an infinite number.
   * @param domain domain (possibly infinite)
   * @return number of operations
   */
  public static Z numberEquivalenceRelations(final Set<?> domain) {
    return numberEquivalenceRelations(domain.size());
  }
}
